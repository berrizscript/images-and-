// Set the default cursor for the entire page
document.body.style.cursor = "url('https://raw.githubusercontent.com/berrizscript/images-and-/refs/heads/main/default.svg'), auto";

// Apply the pointer cursor when hovering over buttons
const buttons = document.querySelectorAll("button");
buttons.forEach(button => {
    button.addEventListener("mouseenter", () => {
        button.style.cursor = "url('https://raw.githubusercontent.com/berrizscript/images-and-/refs/heads/main/handpointing.svg'), auto";
    });
    button.addEventListener("mouseleave", () => {
        button.style.cursor = "url('https://raw.githubusercontent.com/berrizscript/images-and-/refs/heads/main/default.svg'), auto";
    });
});
