<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
  <head>
  <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
  <script>
    google.charts.load('current', {
    'packages': ['map'],
    // Note: you will need to get a mapsApiKey for your project.
    // See: https://developers.google.com/chart/interactive/docs/basic_load_libs#load-settings
    'mapsApiKey': 'AIzaSyCxF9p0e18rdjf1MXyTVK3evaKUeRXmFG0'
    
    });
    google.charts.setOnLoadCallback(drawMap);

    function drawMap() {
      var data = google.visualization.arrayToDataTable([
        ['Country', '국가번호'],
        ['China', 'China: 86'],
        ['India', 'India: 91'],
        ['US', 'US: 1'],
        ['Indonesia', 'Indonesia: 62'],
        ['Brazil', 'Brazil: 55'],
        ['Pakistan', 'Pakistan: 92'],
        ['Nigeria', 'Nigeria: 234'],
        ['Bangladesh', 'Bangladesh: 880'],
        ['Russia', 'Russia: 7'],
        ['Japan', 'Japan: 81']
      ]);

    var options = {
      showTooltip: true,
      showInfoWindow: true
    };

    var map = new google.visualization.Map(document.getElementById('chart_div'));

    map.draw(data, options);
  };
  </script>
  </head>
  <body>
    <div id="chart_div"></div>
  </body>
</html>