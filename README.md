# terminal-todo-mvc

An example project using [membrane's](https://github.com/phronmophobic/membrane) terminal backend to create a terminal app and compiling it using GraalVM.

## Screenshots

![terminal todo example](terminal-todo-mvc.gif?raw=true)

## Usage

### Running

```bash
clojure -M -m terminal-todo-mvc.core
```

### Graalvm compiled

1. Follow the instructions for installing GraalVM. https://github.com/clj-easy/graal-docs/blob/master/doc/hello-world.adoc

2. Compile the binary by running `./compile_native.sh` from the project directory.

3. Run the app `./target/todoapp`

## License

MIT License

Copyright (c) 2020 Adrian

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
