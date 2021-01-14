package myapp

import myplugin.PluginService

class AppController {

    def index() {
        new PluginService()
    }
}
