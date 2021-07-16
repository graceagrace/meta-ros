# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "Bridge communication between ROS and Ignition Transport"
AUTHOR = "Louise Poubel <louise@openrobotics.org>"
ROS_AUTHOR = "Shivesh Khaitan"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "ros_ign"
ROS_BPN = "ros_ign_bridge"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-ignition-msgs7} \
    ${ROS_UNRESOLVED_DEP-ignition-transport10} \
    geometry-msgs \
    nav-msgs \
    rclcpp \
    rosgraph-msgs \
    sensor-msgs \
    std-msgs \
    tf2-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    pkgconfig-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-ignition-msgs7} \
    ${ROS_UNRESOLVED_DEP-ignition-transport10} \
    geometry-msgs \
    nav-msgs \
    rclcpp \
    rosgraph-msgs \
    sensor-msgs \
    std-msgs \
    tf2-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-ignition-msgs7} \
    ${ROS_UNRESOLVED_DEP-ignition-transport10} \
    geometry-msgs \
    nav-msgs \
    rclcpp \
    rosgraph-msgs \
    sensor-msgs \
    std-msgs \
    tf2-msgs \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    launch-ros \
    launch-testing \
    launch-testing-ament-cmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros_ign-release/archive/release/galactic/ros_ign_bridge/0.233.1-5.tar.gz
ROS_BRANCH ?= "branch=release/galactic/ros_ign_bridge"
SRC_URI = "git://github.com/ros2-gbp/ros_ign-release;${ROS_BRANCH};protocol=https"
SRCREV = "ad5ea0fa51d5536309de66e86f4a54ee3c1fb922"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
