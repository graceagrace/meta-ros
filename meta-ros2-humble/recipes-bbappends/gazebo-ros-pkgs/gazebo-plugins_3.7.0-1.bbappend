# Copyright (c) 2024 Wind River Systems, Inc.

inherit pkgconfig

CXXFLAGS += "-Wno-deprecated-declarations -Wno-error=format-security"

LICENSE = "BSD & Apache-2.0"
