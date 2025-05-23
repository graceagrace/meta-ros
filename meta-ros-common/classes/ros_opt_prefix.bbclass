#
# Copyright (c) 2013 Stefan Herbrechtsmeier, Bielefeld University
# Copyright (c) 2019-2020 LG Electronics, Inc.
# Copyright (c) Qualcomm Innovation Center, Inc. All rights reserved
#

ros_base_prefix ?= "/opt/ros/${ROS_DISTRO}"
ros_prefix ?= "${base_prefix}${ros_base_prefix}"

ros_bindir = "${ros_prefix}/bin"
ros_sbindir = "${ros_prefix}/sbin"
ros_libdir = "${ros_prefix}/${baselib}"
ros_libexecdir = "${ros_libdir}/${ROS_BPN}"
ros_includedir = "${ros_prefix}/include"
ros_datadir = "${ros_prefix}/share"
ros_sysconfdir = "${ros_prefix}/etc"
ros_stacksdir = "${ros_prefix}/stacks"
ros_toolsdir = "${ros_prefix}/tools"
ros_optdir = "${ros_prefix}/opt/${ROS_BPN}"

# Used by chrpath.bbclass
PREPROCESS_RELOCATE_DIRS += " \
    ${ros_bindir} \
    ${ros_libdir} \
"

# ROS_PYTHON_VERSION is usually set in generated/superflore-ros-distro.inc, but
# in case superflore-ros-distro.inc isn't included default to 3
ROS_PYTHON_VERSION ?= "3"
inherit ${@'python3-dir' if d.getVar('ROS_PYTHON_VERSION') == '3' else 'python-dir'}

PKG_CONFIG_PATH .= ":${PKG_CONFIG_DIR}:${STAGING_DIR_HOST}${ros_libdir}/pkgconfig:${STAGING_DATADIR}/pkgconfig"

PYTHON_SITEPACKAGES_DIR = "${ros_libdir}/${PYTHON_DIR}/site-packages"

setup_rosoptprefix_config() {
        if [ -n "$PYTHON" ]; then export PYTHONPATH=${STAGING_DIR_NATIVE}${ros_libdir}/${PYTHON_DIR}/site-packages:$PYTHONPATH; fi
}

do_configure:prepend:class-target() {
        setup_rosoptprefix_config
}

do_compile:prepend:class-target() {
        setup_rosoptprefix_config
}

do_install:prepend:class-target() {
        setup_rosoptprefix_config
}

setup_rosoptprefix_native_config() {
        if [ -n "$PYTHON" ]; then export PYTHONPATH=${ros_libdir}/${PYTHON_DIR}/site-packages:$PYTHONPATH; fi
}

do_configure:prepend:class-native() {
        setup_rosoptprefix_native_config
}

do_compile:prepend:class-native() {
        setup_rosoptprefix_native_config
}

do_install:prepend:class-native() {
        setup_rosoptprefix_native_config
}

setup_rosoptprefix_nativesdk_config() {
        if [ -n "$PYTHON" ]; then export PYTHONPATH=${STAGING_DIR_NATIVE}${ros_base_prefix}/lib/${PYTHON_DIR}/site-packages:$PYTHONPATH; fi
}

do_configure:prepend:class-nativesdk() {
        setup_rosoptprefix_nativesdk_config
}

do_compile:prepend:class-nativesdk() {
        setup_rosoptprefix_nativesdk_config
}

do_install:prepend:class-nativesdk() {
        setup_rosoptprefix_nativesdk_config
}

FILES_SOLIBSDEV += " ${ros_libdir}/lib*${SOLIBSDEV}"

FILES:${PN} += "\
    ${ros_bindir} ${ros_libexecdir} ${ros_libdir}/lib*.so \
    ${PYTHON_SITEPACKAGES_DIR} \
    ${ros_datadir} \
    ${ros_sysconfdir} \
    ${ros_stacksdir} \
    ${ros_toolsdir}/ \
    ${ros_prefix} \
    "

FILES:${PN}-dev += "\
    ${ros_includedir} \
    ${ros_libdir}/pkgconfig \
    ${PYTHON_SITEPACKAGES_DIR}/*.la \
    ${ros_datadir}/${ROS_BPN}/cmake \
    ${datadir}/${ROS_BPN}/cmake \
    ${datadir}/${ROS_BPN}/*.template \
    "

FILES:${PN}-dbg += "\
    ${ros_bindir}/.debug ${ros_libexecdir}/.debug ${ros_libdir}/.debug \
    ${ros_datadir}/*/bin/.debug \
    ${PYTHON_SITEPACKAGES_DIR}/.debug \
    ${PYTHON_SITEPACKAGES_DIR}/*/.debug \
    ${PYTHON_SITEPACKAGES_DIR}/*/*/.debug \
    "

FILES:${PN}-staticdev += "\
    ${ros_libdir}/*.a \
    ${ros_libdir}/${ROS_BPN}/*.a \
    "

SYSROOT_DIRS:append = " \
    ${ros_includedir} \
    ${ros_libdir} \
    ${ros_datadir} \
    ${ros_stacksdir} \
    ${ros_sysconfdir} \
    ${ros_bindir} \
    ${ros_sbindir} \
    ${ros_optdir} \
    "

SYSROOT_DIRS_NATIVE:append = " \
    ${ros_bindir} \
    ${ros_libexecdir} \
    "

# The libraries are installed in ros_libdir and if ros_libdir starts with /usr/ it will be catched by libdir QA checker showing errors like these:
# ERROR: filters-1.8.1-r0 do_package_qa: QA Issue: filters-dbg: found library in wrong location: /usr/opt/ros/melodic/lib/.debug/libmean.so
# filters-dbg: found library in wrong location: /usr/opt/ros/melodic/lib/.debug/libtransfer_function.so
# filters-dbg: found library in wrong location: /usr/opt/ros/melodic/lib/.debug/libparams.so
# filters-dbg: found library in wrong location: /usr/opt/ros/melodic/lib/.debug/libmedian.so
# filters-dbg: found library in wrong location: /usr/opt/ros/melodic/lib/.debug/libincrement.so
# filters: found library in wrong location: /usr/opt/ros/melodic/lib/libmean.so
# filters: found library in wrong location: /usr/opt/ros/melodic/lib/libtransfer_function.so
# filters: found library in wrong location: /usr/opt/ros/melodic/lib/libparams.so
# filters: found library in wrong location: /usr/opt/ros/melodic/lib/libmedian.so
# filters: found library in wrong location: /usr/opt/ros/melodic/lib/libincrement.so [libdir]
INSANE_SKIP:${PN}-dbg += "libdir"
INSANE_SKIP:${PN} += "libdir"
