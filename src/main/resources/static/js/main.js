const input = document.getElementById("content-input");

input.addEventListener("input", function() {
    if (input.value) {
        input.classList.add("has-content");
    } else {
        input.classList.remove("has-content");
    }
});

alert("JavaScript is connected!");