# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This package allows you to publish the state of a robot to     <a href="http://ros.org/wiki/tf2">tf2</a>. Once the state gets published, it is     available to all components in the system that also use <tt>tf2</tt>.     The package takes the joint angles of the robot as input     and publishes the 3D poses of the robot links, using a kinematic     tree model of the robot. The package can both be used as a library     and as a ROS node.  This package has been well tested and the code     is stable. No major changes are planned in the near future."
AUTHOR = "Chris Lalancette <clalancette@osrfoundation.org>"
ROS_AUTHOR = "Ioan Sucan <isucan@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/robot_state_publisher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "robot_state_publisher"
ROS_BPN = "robot_state_publisher"

ROS_BUILD_DEPENDS = " \
    kdl-parser \
    libeigen \
    orocos-kdl \
    rosconsole \
    roscpp \
    rostime \
    sensor-msgs \
    tf \
    tf2-kdl \
    tf2-ros \
    urdfdom-headers \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    kdl-parser \
    orocos-kdl \
    rosconsole \
    roscpp \
    rostime \
    sensor-msgs \
    tf \
    tf2-kdl \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    kdl-parser \
    orocos-kdl \
    rosconsole \
    roscpp \
    rostime \
    sensor-msgs \
    tf \
    tf2-kdl \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosbag \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/robot_state_publisher-release/archive/release/noetic/robot_state_publisher/1.15.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/robot_state_publisher"
SRC_URI = "git://github.com/ros-gbp/robot_state_publisher-release;${ROS_BRANCH};protocol=https"
SRCREV = "31d1798c76ee63283a2c4f154c8e913f1ce217c1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
