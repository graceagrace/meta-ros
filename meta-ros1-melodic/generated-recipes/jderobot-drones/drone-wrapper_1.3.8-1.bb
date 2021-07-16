# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The drone_wrapper package"
AUTHOR = "Nikhil Khedekar <nikhilvkhedekar@gmail.com>"
ROS_AUTHOR = "Nikhil Khedekar <nikhilvkhedekar@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=1a58895467feb5b42724abbf3f0d9612"

ROS_CN = "jderobot_drones"
ROS_BPN = "drone_wrapper"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    gazebo-ros \
    geometry-msgs \
    mavros \
    mavros-msgs \
    rospy \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    gazebo-ros \
    geometry-msgs \
    mavros \
    mavros-msgs \
    rospy \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    gazebo-ros \
    geometry-msgs \
    mavros \
    mavros-msgs \
    rospy \
    sensor-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/JdeRobot/drones-release/archive/release/melodic/drone_wrapper/1.3.8-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/drone_wrapper"
SRC_URI = "git://github.com/JdeRobot/drones-release;${ROS_BRANCH};protocol=https"
SRCREV = "d2d51820617423d56689631bc4927233f13b0340"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
