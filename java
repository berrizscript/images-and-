// Create a new style element
const style = document.createElement('style');
style.textContent = `
    /* Set the default cursor for the entire page */
    body {
        cursor: url('https://raw.githubusercontent.com/berrizscript/images-and-/refs/heads/main/default.svg'), auto;
    }
    /* Apply the custom pointer cursor for all buttons */
    button {
        cursor: url('https://raw.githubusercontent.com/berrizscript/images-and-/refs/heads/main/handpointing.svg'), pointer;
    }
`;

// Append the style element to the document head
document.head.appendChild(style);
