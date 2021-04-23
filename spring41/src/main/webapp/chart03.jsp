<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {

        var data = google.visualization.arrayToDataTable([
          ['항목', '시간'],
          ['수업',           9],
          ['온라인 교육',      2],
          ['산책',           1],
          ['운동',         0.5],
          ['인터넷',         2],
          ['식사',           2],
          ['자유시간',         0.5],
          ['잠자기',          7]
        ]);

        var options = {
          title: '나의 하루 일과'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
      }
    </script>
  </head>
  <body>
    <div id="piechart" style="width: 900px; height: 500px;"></div>
  </body>
</html>
