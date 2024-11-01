// Set the default cursor for the entire page
document.body.style.cursor = "url('https://raw.githubusercontent.com/berrizscript/images-and-/refs/heads/main/default.svg'), auto";

// Apply the pointer cursor specifically for buttons
document.querySelectorAll("button").forEach(button => {
    button.style.cursor = "url('https://raw.githubusercontent.com/berrizscript/images-and-/refs/heads/main/handpointing.svg'), pointer";
});
