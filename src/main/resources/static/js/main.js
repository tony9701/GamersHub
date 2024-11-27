document.addEventListener("DOMContentLoaded", function() {
    const avatarButton = document.getElementById('profile-pic');
    // const toggleBtnIcon = document.querySelector('.toggle_btn i');
    const dropdownMenu = document.getElementById('dropdownMenu');

    // Toggle dropdown menu on click
    avatarButton.addEventListener('click', () => {
        dropdownMenu.style.display =
            dropdownMenu.style.display === 'block' ? 'none' : 'block';
    });

// Close the dropdown if clicked outside
    document.addEventListener('click', (event) => {
        if (!avatarButton.contains(event.target) && !dropdownMenu.contains(event.target)) {
            dropdownMenu.style.display = 'none';
        }
    });

    // toggleBtn.onclick = function () {
    //     dropDownMenu.classList.toggle('open');
    //     const isOpen = dropDownMenu.classList.contains('open');
    //
    //     // toggleBtnIcon.classList = isOpen
    //     //     ? 'fa-solid fa-xmark'
    //     //     : 'fa-solid fa-bars';
    // };
});