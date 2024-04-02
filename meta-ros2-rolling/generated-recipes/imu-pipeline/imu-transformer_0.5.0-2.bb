# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Node/components to transform sensor_msgs::Imu data from one frame into another."
AUTHOR = "Paul Bovbel <pbovbel@clearpathrobotics.com>"
ROS_AUTHOR = "Paul Bovbel <pbovbel@clearpathrobotics.com>"
HOMEPAGE = "http://ros.org/wiki/imu_transformer"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

ROS_CN = "imu_pipeline"
ROS_BPN = "imu_transformer"

ROS_BUILD_DEPENDS = " \
    message-filters \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2-ros \
    tf2-sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    message-filters \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2-ros \
    tf2-sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-filters \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2-ros \
    tf2-sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    geometry-msgs \
    tf2-geometry-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/imu_pipeline-release/archive/release/rolling/imu_transformer/0.5.0-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/imu_transformer"
SRC_URI = "git://github.com/ros2-gbp/imu_pipeline-release;${ROS_BRANCH};protocol=https"
SRCREV = "0c04705f881a8a4221d5bbe5ff182578662f09df"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
