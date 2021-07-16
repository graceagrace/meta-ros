# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This package provides an implementation of the Dynamic Window Approach to         local robot navigation on a plane. Given a global plan to follow and a         costmap, the local planner produces velocity commands to send to a mobile         base. This package supports any robot who's footprint can be represented as         a convex polygon or cicrle, and exposes its configuration as ROS parameters         that can be set in a launch file. The parameters for this planner are also         dynamically reconfigurable. This package's ROS wrapper adheres to the         BaseLocalPlanner interface specified in the <a href="http://wiki.ros.org/nav_core">nav_core</a> package."
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
ROS_AUTHOR = "Eitan Marder-Eppstein"
HOMEPAGE = "http://wiki.ros.org/dwa_local_planner"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "navigation"
ROS_BPN = "dwa_local_planner"

ROS_BUILD_DEPENDS = " \
    angles \
    base-local-planner \
    cmake-modules \
    costmap-2d \
    dynamic-reconfigure \
    libeigen \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    dynamic-reconfigure \
    libeigen \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    dynamic-reconfigure \
    libeigen \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/navigation-release/archive/release/noetic/dwa_local_planner/1.17.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/dwa_local_planner"
SRC_URI = "git://github.com/ros-gbp/navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "ead94e3655e9bde82d87ca48555f123da360fdcc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
