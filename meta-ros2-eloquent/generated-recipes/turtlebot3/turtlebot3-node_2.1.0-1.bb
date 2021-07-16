# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "TurtleBot3 driver node that include diff drive controller, odometry and tf node"
AUTHOR = "Will Son <willson@robotis.com>"
ROS_AUTHOR = "Darby Lim <thlim@robotis.com>"
HOMEPAGE = "http://turtlebot3.robotis.com"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "turtlebot3"
ROS_BPN = "turtlebot3_node"

ROS_BUILD_DEPENDS = " \
    dynamixel-sdk \
    geometry-msgs \
    message-filters \
    nav-msgs \
    rclcpp \
    rcutils \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-ros \
    turtlebot3-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamixel-sdk \
    geometry-msgs \
    message-filters \
    nav-msgs \
    rclcpp \
    rcutils \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-ros \
    turtlebot3-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamixel-sdk \
    geometry-msgs \
    message-filters \
    nav-msgs \
    rclcpp \
    rcutils \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-ros \
    turtlebot3-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/robotis-ros2-release/turtlebot3-release/archive/release/eloquent/turtlebot3_node/2.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/turtlebot3_node"
SRC_URI = "git://github.com/robotis-ros2-release/turtlebot3-release;${ROS_BRANCH};protocol=https"
SRCREV = "4e095f7c576813cd556a3353ac69b3897580f0b1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
