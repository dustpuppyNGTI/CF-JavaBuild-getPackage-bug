
push:
	@mvn -DskipTests=true -q package
	@cf target -o your-organisation -s your-space
	@cf push -f src/deploy/cf-manifest.yml
