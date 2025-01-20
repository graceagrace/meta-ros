# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ROS messages used by the axis_camera package to control Axis PTZ and fixed cameras"
AUTHOR = "Chris Iverach-Brereton <civerachb@clearpathrobotics.com>"
ROS_AUTHOR = "Chris Iverach-Brereton <civerachb@clearpathrobotics.com>"
HOMEPAGE = "http://ros.org/wiki/axis_camera"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "axis_camera"
ROS_BPN = "axis_msgs"

ROS_BUILD_DEPENDS = " \
    rosidl-default-generators \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/axis_camera-release/archive/release/humble/axis_msgs/2.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/axis_msgs"
SRC_URI = "git://github.com/clearpath-gbp/axis_camera-release;${ROS_BRANCH};protocol=https"
SRCREV = "5ace26bec7fa88977b3f2c514fe7d6b1012e1ba0"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
