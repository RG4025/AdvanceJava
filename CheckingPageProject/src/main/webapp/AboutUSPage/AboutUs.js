$(document).ready(function () {
  $(".carouselMain").owlCarousel({
    items: 3,
    touchDrag: true,
    mouseDrag: true,
    margin: 25,
    loop: true,
    autoplay: true,
    nav: true,
    autoplayTimeOut: 1000,
    autoplayHoverPause: true,
    responsive: {
      0: {
        items: 1,
        nav: false,
      },
      600: {
        items: 2,
        nav: false,
      },
      1000: {
        items: 3,
        nav: false,
      },
    },
  });

});








var scrolling = 0;
navbar = document.getElementById("main_nav_fix");
window.addEventListener("scroll", function () {
  var scrollTop = window.pageYOffset || document.documentElement.scrollTop;
  var scrollTopOne = window.pageYOffset || document.documentElement.scrollTop;
  if (scrollTop > scrolling) {
    navbar.style.top = "-200px";
    navbar.style.transition = "all ease 1s";
  } else {
    navbar.style.transition = "all ease 1s";
    navbar.style.top = "0px";
  }
  scrolling = scrollTop;
  if (scrollTopOne === 0) {
    navbar.style.backdropFilter = "none";
  } else {
    navbar.style.backdropFilter = "saturate(180%) blur(50px)";
  }
});

