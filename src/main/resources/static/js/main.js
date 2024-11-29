document.addEventListener("DOMContentLoaded", function() {

    const avatarButton = document.getElementById('profile-pic');
    const dropdownMenu = document.getElementById('dropdownMenu');
    const profilePic = document.getElementById('profile-pic');

    // Toggle dropdown menu on click
    avatarButton.addEventListener('click', (event) => {
        event.stopPropagation();
        dropdownMenu.classList.toggle('show')
    });

    avatarButton.addEventListener('click', (event) => {
        event.stopPropagation();
        profilePic.classList.toggle('show')
    });

// Close the dropdown if clicked outside
    document.addEventListener('click', (event) => {
        if (!avatarButton.contains(event.target) && !dropdownMenu.contains(event.target)) {
            dropdownMenu.classList.remove("show");
            profilePic.classList.remove('show');
        }
    });
});