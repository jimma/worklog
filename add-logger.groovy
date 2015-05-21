def loggers = root.profile.subsystem*.logger
loggers.add(0, {logger('category':'org.apache.cxf.ws.rm.persistence.jdbc') } )


def logging = root.profile.subsystem.'logger'[0]
/**
 * def newLogging = root.profile.subsystem.'logger'[0].replaceNode('logger', ['category':'org.apache.cxf.ws.rm.persistence.jdbc'])
 */ 
logging.attributes()['category'] = 'org.apache.cxf.ws.rm.persistence.jdbc' 
def level = root.profile.subsystem.logger.level[0]
level.attributes()['name'] = 'DEBUG'

