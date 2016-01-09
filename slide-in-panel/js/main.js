
function hideContentPanel() {
  $('.cd-panel').removeClass('is-visible');
}

function showContentPanel() {
  $('.cd-panel').addClass('is-visible');
}

function contentPanelIsVisible() {
  return $('.cd-panel').hasClass('is-visible');
}

jQuery(document).ready(function($){
	$('.cd-btn').on('click', function(event){
		event.preventDefault();
    showContentPanel();
	});

	$('.cd-panel').on('click', function(event){
		if( $(event.target).is('.cd-panel') || $(event.target).is('.cd-panel-close') ) { 
      hideContentPanel();
			event.preventDefault();
		}
	});

  $(document).keyup(function(e) {
    var ESC_KEY = 27;
    var W_KEY   = 87

    if (e.keyCode == ESC_KEY ) { 
      if (contentPanelIsVisible()) {
        hideContentPanel();
      }
    } else if (e.keyCode == W_KEY) {
      if (!contentPanelIsVisible()) {
        showContentPanel();
      }
    }
  });

  $(document).keyup(function(e) {
    if (e.keyCode == ESC_KEY) { 
      if (contentPanelIsVisible()) {
        hideContentPanel();
      }
    }
  });

});
