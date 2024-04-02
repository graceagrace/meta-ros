# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "<p>       Contains a node that rotates an image stream in a way that minimizes       the angle between a vector in some arbitrary frame and a vector in the       camera frame. The frame of the outgoing image is published by the node.     </p>     <p>       This node is intended to allow camera images to be visualized in an       orientation that is more intuitive than the hardware-constrained       orientation of the physical camera. This is particularly helpful, for       example, to show images from the PR2's forearm cameras with a       consistent up direction, despite the fact that the forearms need to       rotate in arbitrary ways during manipulation.     </p>     <p>       It is not recommended to use the output from this node for further       computation, as it interpolates the source image, introduces black       borders, and does not output a camera_info.     </p>"
AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
ROS_AUTHOR = "Blaise Gassend"
HOMEPAGE = "https://index.ros.org/p/image_rotate/github-ros-perception-image_pipeline/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=32;endline=32;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "image_pipeline"
ROS_BPN = "image_rotate"

ROS_BUILD_DEPENDS = " \
    class-loader \
    cv-bridge \
    geometry-msgs \
    image-transport \
    opencv \
    rcl-interfaces \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    image-transport \
    opencv \
    rcl-interfaces \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    image-transport \
    opencv \
    rcl-interfaces \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
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

# matches with: https://github.com/ros2-gbp/image_pipeline-release/archive/release/rolling/image_rotate/5.0.0-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/image_rotate"
SRC_URI = "git://github.com/ros2-gbp/image_pipeline-release;${ROS_BRANCH};protocol=https"
SRCREV = "142a5da831df1895bf1bc885c7bac52a8d9c5910"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
