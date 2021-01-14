# grails3-plugin-test

Laget med oppskrift fra [Grails dokumentasjonen](https://docs.grails.org/3.3.8/guide/plugins.html#_plugins_and_multi_project_builds):

- grails create-app myapp
- grails create-plugin myplugin
- echo 'include "myapp", "myplugin"' > settings.gradle
- printf "\ngrails {\n\tplugins {\n\t\tcompile project(':myplugin')\n\t}\n}" >> myapp/build.gradle
- printf "exploded=true\n" >> myplugin/gradle.properties
- cd myapp
- grails run-app

Legger så til PluginService i myplugin og AppController i myapp.
