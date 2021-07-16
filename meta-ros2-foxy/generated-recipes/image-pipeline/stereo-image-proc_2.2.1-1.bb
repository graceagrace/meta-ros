# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Stereo and single image rectification and disparity processing."
AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
ROS_AUTHOR = "Patrick Mihelich"
HOMEPAGE = "https://index.ros.org/p/stereo_image_proc/github-ros-perception-image_pipeline/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "image_pipeline"
ROS_BPN = "stereo_image_proc"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    image-geometry \
    image-proc \
    image-transport \
    message-filters \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    stereo-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    image-geometry \
    image-proc \
    image-transport \
    message-filters \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    stereo-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    image-geometry \
    image-proc \
    image-transport \
    message-filters \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    stereo-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch \
    launch-ros \
    launch-testing \
    launch-testing-ament-cmake \
    opencv \
    python-cmake-module \
    rclpy \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/image_pipeline-release/archive/release/foxy/stereo_image_proc/2.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/stereo_image_proc"
SRC_URI = "git://github.com/ros2-gbp/image_pipeline-release;${ROS_BRANCH};protocol=https"
SRCREV = "c44d44148f9408aad8e95330671e5dc239558e72"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
