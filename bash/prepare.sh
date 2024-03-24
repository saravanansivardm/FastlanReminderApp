rm -rf node_modules
yarn install

npx pod-install

# shellcheck disable=SC2164
cd android
.gradlew clean
bundle install
bundle exec fastlane install_plugins

