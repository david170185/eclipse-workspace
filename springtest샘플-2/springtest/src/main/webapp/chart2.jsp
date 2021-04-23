<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['bar']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
            ['월별', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12'],
            ['월별 조회수', 1400, 1200, 1100, 1000, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500],
          ]);


        var options = {
          chart: {
            title: '월별 동영상 조회수',
            subtitle: '2020년 월별 동영상 조회수 변동률',
          },
          bars: 'vertical' // Required for Material Bar Charts.
        };

        var chart = new google.charts.Bar(document.getElementById('barchart_material'));

        chart.draw(data, google.charts.Bar.convertOptions(options));
      }
    </script>
  </head>
  <body>
    <div id="barchart_material" style="width: 900px; height: 500px;"></div>
  </body>
</html>
