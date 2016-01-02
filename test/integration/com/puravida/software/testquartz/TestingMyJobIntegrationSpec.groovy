package com.puravida.software.testquartz

import com.puravida.software.testquartz.MyJob
import grails.test.spock.IntegrationSpec

class TestingMyJobIntegrationSpec extends IntegrationSpec {

def jobManagerService

	def setup() {
		println "starting"
		jobManagerService.quartzScheduler.start()
		Thread.sleep(3000L );
		println "started"
	}

	def cleanup() {
		println "cleaning"
		while( jobManagerService.runningJobs.size() ){ 
			println "waiting..."
			sleep(100)
		}
		println "after test MyDomain count = ${MyDomain.count()}"
	}

	void "test something"() {
when:

expect:
	true
	
	}
}
