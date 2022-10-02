# BEGIN https://github.com/bazelbuild/rules_jvm_external
RULES_JVM_EXTERNAL_TAG = "4.2"
RULES_JVM_EXTERNAL_SHA = "cd1a77b7b02e8e008439ca76fd34f5b07aecb8c752961f9640dea15e9e5ba1ca"

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive", "http_file")
http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)
# END https://github.com/bazelbuild/rules_jvm_external

# START https://github.com/bazelbuild/bazel-skylib
load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
http_archive(
    name = "bazel_skylib",
    urls = [
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-skylib/releases/download/1.3.0/bazel-skylib-1.3.0.tar.gz",
        "https://github.com/bazelbuild/bazel-skylib/releases/download/1.3.0/bazel-skylib-1.3.0.tar.gz",
    ],
    sha256 = "74d544d96f4a5bb630d465ca8bbcfe231e3594e5aae57e1edbf17a6eb3ca2506",
)

load("@bazel_skylib//:workspace.bzl", "bazel_skylib_workspace")
bazel_skylib_workspace()
# END https://github.com/bazelbuild/bazel-skylib

# BEGIN https://github.com/MihaiBojin/bazel_java_rules
#local_repository(
#    name = "com_github_mihaibojin_bazel_java_rules",
#    path = "/Users/mihaibojin/git/bazel_java_rules",
#)
load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")
git_repository(
    name = "com_github_mihaibojin_bazel_java_rules",
    remote = "https://github.com/MihaiBojin/bazel_java_rules",
    commit = "e76e1bc54c9e646a6495d4c43ad870296ab15427",
)

load("@com_github_mihaibojin_bazel_java_rules//google-java-format:workspace.bzl", "google_java_format_jar")
google_java_format_jar()

load("@com_github_mihaibojin_bazel_java_rules//checkstyle:workspace.bzl", "checkstyle_jar")
checkstyle_jar()

load("@com_github_mihaibojin_bazel_java_rules//errorprone:workspace.bzl", "errorprone_workspace")
load("@com_github_mihaibojin_bazel_java_rules//nullaway:workspace.bzl", "nullaway_workspace")
load("@com_github_mihaibojin_bazel_java_rules//junit5:workspace.bzl", "junit5_workspace")

# BEGIN java dependencies
load("@rules_jvm_external//:defs.bzl", "maven_install")
maven_install(
    artifacts =
        ["com.mihaibojin.props:props-core:0.0.4"] +
        errorprone_workspace() +
        nullaway_workspace() +
        junit5_workspace() +
        [
            "org.openjdk.jmh:jmh-core:1.23",
            "org.openjdk.jmh:jmh-generator-annprocess:1.23",
        ],
    fetch_sources = True,
    strict_visibility = True,
    repositories = [
        "https://repo1.maven.org/maven2",
    ],
)
# END https://github.com/MihaiBojin/bazel_java_rules

# BEGIN https://github.com/buchgr/rules_jmh
load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
# http_archive(
#   name = "rules_jmh",
#   strip_prefix = "MihaiBojin-rules_jmh-f3b9bd0",
#   url = "https://github.com/MihaiBojin/rules_jmh/zipball/f3b9bd0435d6ab645f0a81cfcd365dc6fb65f820",
#   type = "zip",
#   sha256 = "d87a34ed7d17910bacebcaf2786fee8a284d5f640ef59e750975d59433e79f00",
# )
http_archive(
  name = "rules_jmh",
  strip_prefix = "buchgr-rules_jmh-6ccf8d7",
  url = "https://github.com/buchgr/rules_jmh/zipball/6ccf8d7b270083982e5c143935704b9f3f18b256",
  type = "zip",
  sha256 = "dbb7d7e5ec6e932eddd41b910691231ffd7b428dff1ef9a24e4a9a59c1a1762d",
)

load("@rules_jmh//:deps.bzl", "rules_jmh_deps")
rules_jmh_deps()

load("@rules_jmh//:defs.bzl", "rules_jmh_maven_deps")
# rules_jmh_maven_deps(fetch_sources = True)
rules_jmh_maven_deps()
# END https://github.com/buchgr/rules_jmh
