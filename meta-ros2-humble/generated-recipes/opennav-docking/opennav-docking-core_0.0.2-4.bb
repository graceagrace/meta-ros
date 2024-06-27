# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "A set of headers for plugins core to the opennav docking framework"
AUTHOR = "Steve Macenski <steve@opennav.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "opennav_docking"
ROS_BPN = "opennav_docking_core"

ROS_BUILD_DEPENDS = " \
    nav2-util \
    opennav-docking-msgs \
    rclcpp \
    rclcpp-lifecycle \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    nav2-util \
    opennav-docking-msgs \
    rclcpp \
    rclcpp-lifecycle \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    nav2-util \
    opennav-docking-msgs \
    rclcpp \
    rclcpp-lifecycle \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/open-navigation/opennav_docking-release/archive/release/humble/opennav_docking_core/0.0.2-4.tar.gz
ROS_BRANCH ?= "branch=release/humble/opennav_docking_core"
SRC_URI = "git://github.com/open-navigation/opennav_docking-release;${ROS_BRANCH};protocol=https"
SRCREV = "e3c499abca5cbebc009c05f9195422f696599784"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
