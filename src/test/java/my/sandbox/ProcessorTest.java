package my.sandbox;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ProcessorTest {

  @Test
  void process_when() {
    Processor processor = new Processor();
    Parent parent = spy(Parent.class);
    Child child = spy(Child.class);

    when(parent.getChild()).thenReturn(child);

    processor.processData(parent, child);

    assertEquals(parent.getMoney(), parent.getChild().getMoney());
  }
}
