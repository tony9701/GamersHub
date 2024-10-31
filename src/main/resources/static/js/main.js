document.querySelectorAll('.input-box input').forEach(input => {
    input.addEventListener('input', () => {
        if (input.value) {
            input.classList.add('has-content');
        } else {
            input.classList.remove('has-content');
        }
    });
});