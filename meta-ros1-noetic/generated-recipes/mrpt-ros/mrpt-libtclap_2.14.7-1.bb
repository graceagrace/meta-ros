# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Mobile Robot Programming Toolkit (MRPT) libraries (tclap C++ library).   This package contains: mrpt-tclap"
AUTHOR = "Jose-Luis Blanco-Claraco <joseluisblancoc@gmail.com>"
ROS_AUTHOR = "Jose-Luis Blanco-Claraco <joseluisblancoc@gmail.com>"
HOMEPAGE = "https://www.mrpt.org/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mrpt_ros"
ROS_BPN = "mrpt_libtclap"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-liboctomap-dev} \
    ${ROS_UNRESOLVED_DEP-libopenni2-dev} \
    assimp \
    cv-bridge \
    ffmpeg \
    freeglut \
    glfw \
    jpeg \
    libeigen \
    libfreenect \
    libpcap \
    libtinyxml2 \
    libusb1 \
    libxrandr \
    libxxf86vm \
    mesa \
    mrpt-libbase \
    opencv \
    pkgconfig \
    python3-pip \
    python3-pybind11 \
    ros-environment \
    rosbag-storage \
    roscpp \
    suitesparse-cholmod \
    suitesparse-cxsparse \
    tf2-geometry-msgs \
    udev \
    wxwidgets \
    zlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/mrpt-ros-pkg-release/mrpt_ros-release/archive/release/noetic/mrpt_libtclap/2.14.7-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/mrpt_libtclap"
SRC_URI = "git://github.com/mrpt-ros-pkg-release/mrpt_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "551e327a687944417ca1c37239b44b2b301f3c9d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
