native-image --report-unsupported-elements-at-runtime \
             --initialize-at-build-time \
             --no-server \
             -jar ./target/uberjar/terminal-todo-mvc-0.1.0-SNAPSHOT-standalone.jar \
             -H:Name=./target/todoapp
