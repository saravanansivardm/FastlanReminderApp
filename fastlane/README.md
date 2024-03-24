fastlane documentation
----

# Installation

Make sure you have the latest version of the Xcode command line tools installed:

```sh
xcode-select --install
```

For _fastlane_ installation instructions, see [Installing _fastlane_](https://docs.fastlane.tools/#installing-fastlane)

# Available Actions

## Android

### android testApp

```sh
[bundle exec] fastlane android testApp
```

Prepare Android Testing

### android build_debug_android

```sh
[bundle exec] fastlane android build_debug_android
```

Prepare Android Debug Build

### android increment_version_code

```sh
[bundle exec] fastlane android increment_version_code
```

Increase Version Code

### android increment_version_name

```sh
[bundle exec] fastlane android increment_version_name
```

Increase Version Name

### android release_build

```sh
[bundle exec] fastlane android release_build
```

Prepare Android Release Build

### android beta_android

```sh
[bundle exec] fastlane android beta_android
```

Prepare Android Build & Distribute to Firebase App Distribution

### android bump_version

```sh
[bundle exec] fastlane android bump_version
```

Bump version code and version name

----

This README.md is auto-generated and will be re-generated every time [_fastlane_](https://fastlane.tools) is run.

More information about _fastlane_ can be found on [fastlane.tools](https://fastlane.tools).

The documentation of _fastlane_ can be found on [docs.fastlane.tools](https://docs.fastlane.tools).
