package CursovaApi.Models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RemoveTaskRequest {
    private String jsonrpc;
    private String method;
    private long id;
    private RemoveTaskRequest.ParamsRemote params;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ParamsRemote {
        private int task_id;
    }
}
