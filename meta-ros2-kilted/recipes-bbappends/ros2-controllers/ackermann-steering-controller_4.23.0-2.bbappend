ROS_BUILDTOOL_DEPENDS += " \
    generate-parameter-library-py-native \
"

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
SRC_URI += "file://disable-compiler-options.patch"
