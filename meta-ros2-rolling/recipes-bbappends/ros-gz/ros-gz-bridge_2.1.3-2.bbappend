# Copyright (c) 2024 Wind River Systems, Inc.

<<<<<<< HEAD
ROS_BUILDTOOL_DEPS += "protobuf-native"
=======
ROS_BUILDTOOL_DEPENDS += " \
    protobuf-native \
    launch-native \
    launch-ros-native \
"

inherit python3native
>>>>>>> master-next

EXTRA_OECMAKE += " \
    -DPROTOBUF_PROTOC_EXECUTABLE=${STAGING_BINDIR_NATIVE}/protoc \
"
<<<<<<< HEAD
=======

do_compile:prepend() {
    export LD_LIBRARY_PATH="${RECIPE_SYSROOT_NATIVE}/${ros_libdir}"
}
>>>>>>> master-next
