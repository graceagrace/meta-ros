LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a461be67a1edf991251f85f3aadd1d0 \
                    file://profiler/src/Remotery/LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "git://github.com/gazebosim/gz-common.git;protocol=https;branch=ign-common3"

SRCREV = "ac3fd976334ce3712f773179dd6c820ba286b652"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

# CMake Error: TRY_RUN() invoked in cross-compiling mode, please set the following cache variables appropriately:
#    FREEIMAGE_RUNS (advanced)
#    FREEIMAGE_RUNS__TRYRUN_OUTPUT (advanced)
EXTRA_OECMAKE += " -DFREEIMAGE_RUNS=1 -DFREEIMAGE_RUNS__TRYRUN_OUTPUT=0"

CXX_FLAGS += "-Wno-deprecated-declarations -Wno-implicit-fallthrough"

OECMAKE_GENERATOR = "Unix Makefiles"

DEPENDS = " \
    cppcheck-native \
    doxygen-native \
    graphviz-native \
    gts \
    ffmpeg \
    freeimage \
    ignition-cmake2 \
    ignition-math6 \
    ignition-utils1 \
    libtinyxml2 \
    util-linux \
"

FILES:${PN} += " \
    ${datadir}/ignition/ignition-common3/profiler_vis/* \
    ${datadir}/ignition/ignition-common3/ignition-common3.tag.xml \
"

BBCLASSEXTEND = "native nativesdk"
