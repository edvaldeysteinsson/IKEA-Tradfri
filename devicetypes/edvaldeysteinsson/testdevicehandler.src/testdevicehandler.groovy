metadata {
  definition (name: "TestDeviceHandler", namespace: "edvaldeysteinsson", author: "Edvald Eysteinsson") {
    capability "Switch"
    capability "Light"
  }

  // simulator metadata
  simulator {
  }

  // UI tile definitions
  tiles {
    multiAttributeTile(name:"switch", type: "lighting", width: 3, height: 4, canChangeIcon: true){
      tileAttribute ("device.switch", key: "PRIMARY_CONTROL") {
        attributeState "on", label:'On', action:"switch.off", icon:"st.Appliances.appliances14", backgroundColor:"#79b821", nextState:"off"
        attributeState "off", label:'Off', action:"switch.on", icon:"st.Appliances.appliances14", backgroundColor:"#ffffff", nextState:"on"
      }
    }

    main(["switch"])
  }
}

def parse(String description) {
}

def on() {
  log.info "Switch On"
  makeCall(1)
}

def off() {
  log.info "Switch Off"
  makeCall(0)
}

def makeCall(level) {
  
}
