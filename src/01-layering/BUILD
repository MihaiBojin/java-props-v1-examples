load("@rules_java//java:defs.bzl", "java_library")
load("@com_github_mihaibojin_bazel_java_rules//nullaway:rules.bzl", "nullaway_plugin")
load("@com_github_mihaibojin_bazel_java_rules//checkstyle:rules.bzl", "checkstyle")
load("@com_github_mihaibojin_bazel_java_rules//google-java-format:rules.bzl", "java_format")
load("@rules_jvm_external//:defs.bzl", "artifact")

java_binary(
    name = "main",
    main_class = "Main",
    runtime_deps = [":main-library"],
)

java_library(
    name = "main-library",
    srcs = glob(["java/**/*.java"]),
    deps = [artifact("com.mihaibojin.props:props-core")],
    javacopts = [
        "-Xep:NullAway:ERROR",
        "-XepOpt:NullAway:AnnotatedPackages=",
    ],
    plugins = ["nullaway"],
    resources = glob(["resources/**"]),
    visibility = [
        "//src/test:__subpackages__",
    ],
)

nullaway_plugin(name = "nullaway")

checkstyle(
    name = "checkstyle",
    srcs = glob(["java/**/*.java"]),
    checkstyle_suppressions = "//third-party/checkstyle:checkstyle-suppressions.xml",
    checkstyle_xml = "//third-party/checkstyle:checkstyle.xml",
    checkstyle_xpath_suppressions = "//third-party/checkstyle:checkstyle-xpath-suppressions.xml",
    license_header = "//third-party/checkstyle:license-header.txt",
)

java_format(
    name = "google-java-format-check",
    srcs = glob(["java/**/*.java"]),
    dry_run = True,
    tags = ["no-ide"],
)

java_format(
    name = "google-java-format",
    srcs = glob(["java/**/*.java"]),
    dry_run = False,
    replace = True,
    set_exit_if_changed = False,
    tags = ["no-ide"],
)
