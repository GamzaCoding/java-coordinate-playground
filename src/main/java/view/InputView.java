package view;

import model.Point;
import model.PointDto;
import model.Shape;
import model.ShapeFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {
    private static final String INPUT_INFORMATION= "좌표를 입력하세요.";
    private static final String INVALID_POINT_FORMAT = "좌표의 형식과 다릅니다";
    private static final String INVALID_POINT_RANGE = "좌표의 범위는 0부터 24까지입니다.";

    private final Scanner scanner;

    public InputView(){
        this.scanner = new Scanner(System.in);
    }

    public Shape input() {
        return getShape();
    }

    private Shape getShape(){
        List<PointDto> dtoList = splitPoint(inputPoint());
        validatePointRange(dtoList);

        return ShapeFactory.createShape(createShape(dtoList));
    }

    private List<Point> createShape(List<PointDto> dtoList){
        List<Point> result = new ArrayList<>();
        for(PointDto dto : dtoList){
            result.add(new Point(dto.getX(), dto.getY()));
        }
        return result;
    }

    private String inputPoint(){
        System.out.println(INPUT_INFORMATION);
        String inputPointEntity = scanner.next();
        validatePointFormat(inputPointEntity);
        return inputPointEntity;
    }

    private void validatePointFormat(String stringFormatPoint){
        Pattern pattern = Pattern.compile("\\(\\d{1,2},\\d{1,2}\\)(-\\(\\d{1,2},\\d{1,2}\\)){1,3}");
        Matcher matcher = pattern.matcher(stringFormatPoint);
        if(!matcher.matches()){
            throw new IllegalArgumentException(INVALID_POINT_FORMAT);
        }
    }

    private void validatePointRange(List<PointDto> dtoList){
        for (PointDto dto : dtoList) {
            int x = dto.getX();
            int y = dto.getY();
            if(x > 24 || x < 0 || y > 24 || y < 0){
                throw new IllegalArgumentException(INVALID_POINT_RANGE);
            }
        }
    }

    private List<PointDto> splitPoint(String stringFormatPoint){  // 너무 하드코딩 같은데
        List<PointDto> list = new ArrayList<>();
        String replacedStringFormatPoint = stringFormatPoint.replaceAll("[\\(\\)]", ""); // 괄호 벗김
        String[] points = replacedStringFormatPoint.split("-");
        for(String point : points){
            String[] split = point.split(",");
            list.add(new PointDto(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
        }
        return list;
    }

}














