package sample

import org.springframework.scheduling.annotation.Async

import javax.transaction.Transactional

@Transactional
class TestService {

    Test makeTest() {
        Test t = new Test()
        t.make = "asd"
        t.save()
        return t
    }

    List<Test> getTests() {
        return Test.list()
    }

    @Async
    String asTest(Test t) {
        Test.withNewSession {
            Test.withTransaction {
                t.make = "q"
                t.save(flush: true)
                log.info(t.make)
            }
        }
    }
}
