document.addEventListener("DOMContentLoaded", function() {
    var img = document.getElementsByClassName("clickImage")
    Array.from(img).forEach((i) => {
        i.addEventListener("click", function() {
            window.location.href = "/detail/" + this.dataset.id;
        });
    });
});