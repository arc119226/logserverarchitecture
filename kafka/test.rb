require 'kafka'

kafka = Kafka.new(["192.168.162.71:32776","192.168.162.71:32777","192.168.162.71:32778"], client_id: "my-application")
kafka.deliver_message("Hello, World!", topic: "greeting")
