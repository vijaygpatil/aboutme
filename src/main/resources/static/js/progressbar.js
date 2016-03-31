!function ($) {
	
	//Class Definition
    var Progressbar = function (element) {
        this.$element = $(element);
    };
    
    //Progressbar Update Function
    Progressbar.prototype.update = function (value) {
        var $div = this.$element.find('div');
        //var $span = $div.find('span');
        $div.attr('aria-valuenow', value);
        $div.css('width', value + '%');
        //$span.text(value + '% Complete');
    };

    //Progressbar Finish Function
    Progressbar.prototype.finish = function () {
        this.update(100);
    };

    //Progressbar Reset Function
    Progressbar.prototype.reset = function () {
        this.update(0);
    };
    
    //Plugin Definition
    $.fn.progressbar = function (option) {
        return this.each(function () {
        	var progressBar = new Progressbar(this);
            if (typeof option == 'string') progressBar[option]();
            if (typeof option == 'number') progressBar.update(option);
        });
    };
}(window.jQuery);