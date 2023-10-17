package Week5.BootDemo.src.main.java.gdsc.backend.BootDemo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/demo")
public class DemoController {
    private final DemoService demoService;

    // 객체 반환
    @GetMapping("/demoEntities")
    public ResponseEntity<List<DemoDto>> getDemoEntities() {
        return ResponseEntity.ok().body(demoService.getDemoEntities());
    }

    // 객체 추가
    @PostMapping("/demoEntities")
    public void getDemoEntities(@RequestBody DemoDto demoDto) {
        demoService.addDemoEntity(demoDto);
    }

    // id 로 객체 조회
    @GetMapping("/{id}")
    public ResponseEntity<List<DemoDto>> getNameById(@PathVariable Long id) {
        return ResponseEntity.ok().body(demoService.getDemoEntity(id));
    }
}
