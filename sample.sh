set -e
GIT_TAG=$(git describe --abbrev=0)
./gradlew clean documentation:generatePublishableDocs
if [ [ ! $GIT_TAG == *"-"* ] ]; then
  git fetch --no-tags origin gh-pages
  git checkout gh-pages
  cp -R documentation/build/publishableDocs/. ./docs
  git add docs
  git config user.name "Travis CI"
  git config user.email "email"
  git commit -m "Update documentation for $GIT_TAG"
  git push origin gh-pages

fi