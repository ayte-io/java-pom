# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [0.2.4] - 19-03-2019
### Changed

Removed sonar analysis branch property, reverting 0.2.3

## [0.2.3] - 17-03-2019 - YANKED

Yanked since a) it didn't work and b) prevented sonar from doing initial
analysis

### Added

- Git branch property to sonar analysis configuration

### Removed

- Automatic-Module-Name profile since Maven doesn't trigger profiles on
POM properties.

## [0.2.2] - 17-03-2019
### Fixed

- Invalid jar plugin property in `packaging.automatic-module-name` 
profile

## [0.2.1] - 17-03-2019 - YANKED

Yanked because jar plugin configuration used `packaging.module-name` 
property (instead of `packaging.automatic-module-name`).

### Added

- `release` profile with javadoc and sources jar plugins enabled
automatically
- `packaging.automatic-module-name` profile that adds
`Automatic-Module-Name` manifest entry to jar plugin configuration if 
`packaging.automatic-module-name` property is set.

## [0.2.0] - 17-03-2019
- Technical release, moving to maven central

## [0.1.11] - 16-03-2019
### Added

- PMD, Checkstyle, SpotBugs and JaCoCo plugins

## [0.1.10] - 10-03-2019
### Changed

- Changed Allure report path to `target/site/allure`
- Changed Sonar project key to `group id:artifact id`

## [0.1.9] - 10-03-2019

- Changed allure report directory to {root}/target/allure/report
- Added license files

## [0.1.8] - 10-03-2019

- Added junit params dependency

## [0.1.7] - 08-03-2019

- Added SonarQube scanner plugin

## [0.1.6] - 08-03-2019

- Technical release, no changes

## [0.1.5] - 08-03-2019

- Added extra fields to child projects

## [0.1.4] - 08-03-2019

- Technical release, no changes

## [0.1.3] - 08-03-2019

- Technical release, no changes

## [0.1.2] - 08-03-2019

- Tied all projects together

## [0.1.1] - 08-03-2019

- Added jCenter repository

## [0.1.0] - 08-03-2019
### Added

- Initial version
