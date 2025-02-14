# Copyright (c) 2024 Wind River Systems, Inc.

<<<<<<< HEAD
ROS_BUILDTOOL_DEPS += "protobuf-native"
=======
ROS_BUILDTOOL_DEPENDS += "protobuf-native"
>>>>>>> master-next

EXTRA_OECMAKE += " \
    -DPROTOBUF_PROTOC_EXECUTABLE=${STAGING_BINDIR_NATIVE}/protoc \
"
