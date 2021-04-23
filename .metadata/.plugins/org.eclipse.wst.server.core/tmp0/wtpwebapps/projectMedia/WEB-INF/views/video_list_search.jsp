<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<div id="content">
		<div id="video_contents">
			<div id="video_recently">
				<div class="video_all">
					<div class="video_title">
						<br>
						<hr></hr>
						<h2>선택한 동영상 : ${nae}</h2>
					</div>
					<ul class="video_cir">
						<c:forEach var="vo" items="${list}" begin="0" end="5">
							<li>
								<div class="video_img">
									<a href="Videoplay.jsp?video_code=${vo.video_code}"><img
										src="${vo.video_img}"></a>
								</div>
								<div class="video_name">
									<a href="Videoplay.jsp?video_code=${vo.video_code}">${vo.video_name}</a><br>
									좋아요 : ${vo.video_good} 조회수 : ${vo.video_views}
								</div>
							</li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
	</div>
<!-- <!DOCTYPE html> -->
<!-- <html>
<head> -->