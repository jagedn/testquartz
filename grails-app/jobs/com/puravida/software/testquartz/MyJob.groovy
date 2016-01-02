package com.puravida.software.testquartz



class MyJob {
    static triggers = {
      simple repeatInterval:1000, repeatCount: 4 // 5 shot 
    }

    def execute() {
        // execute job
	println "yeaaahhhhh"
	MyDomain add = new MyDomain(name:"${new Date()}")
	add.save(flush:true)
    }
}
