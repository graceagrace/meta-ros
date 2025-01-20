# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Command line tool to create a video from a rosbag recording"
AUTHOR = "Błażej Sowa <blazej@fictionlab.pl>"
ROS_AUTHOR = "Ivan Santiago Paunovic <ivanpauno@ekumenlabs.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "rosbag2_to_video"
ROS_BPN = "rosbag2_to_video"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    opencv \
    rclpy \
    ros2bag \
    rosbag2-py \
    rosidl-runtime-py \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-mypy \
    ament-pep257 \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosbag2_to_video-release/archive/release/rolling/rosbag2_to_video/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/rosbag2_to_video"
SRC_URI = "git://github.com/ros2-gbp/rosbag2_to_video-release;${ROS_BRANCH};protocol=https"
SRCREV = "661e2dbb6a6fe64d1615442ab0666b76b20e36ba"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
