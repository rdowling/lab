var Test = (function () {
    function Test() {
    }
    Test.prototype.sayhi = function () {
        console.log("hello!");
    };
    return Test;
})();
var o = new Test();
o.sayhi();
