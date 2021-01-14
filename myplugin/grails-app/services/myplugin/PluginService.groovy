package myplugin

import grails.gorm.transactions.Transactional

@Transactional
class PluginService {

    String serviceMethod() {
        return "TEST"
    }
}
